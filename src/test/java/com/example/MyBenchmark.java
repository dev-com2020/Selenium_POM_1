package com.example;
import org.openjdk.jmh.annotations.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
public class MyBenchmark {

    private List<TestData> testDataList;
    private int index;

    @Setup(Level.Trial)
    public void setUp() throws IOException {
        testDataList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader("src/test/resources/MOCK_DATA.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            testDataList.add(new TestData(Integer.parseInt(parts[0]), parts[1]));
        }
        reader.close();
        index = 0;
    }

    @Benchmark
    @BenchmarkMode(Mode.Throughput)
    @OutputTimeUnit(TimeUnit.SECONDS)
    @Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
    @Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
    @Fork(1)
    public void test() {
        if (index >= testDataList.size()) {
            index = 0;
        }
        TestData data = testDataList.get(index);
        System.out.println(data.input1 + " " + data.input2);
        index++;
    }


    public static class TestData {
        public final int input1;
        public final String input2;

        public TestData(int input1, String input2) {
            this.input1 = input1;
            this.input2 = input2;

        }
    }
}