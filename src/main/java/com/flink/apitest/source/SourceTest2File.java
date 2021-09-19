package com.flink.apitest.source;

import com.flink.constant.Constant;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @author Bowie Young
 * @date 2021/9/19
 */
public class SourceTest2File {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        // 从文件读取数据
        DataStream<String> dataStream = env.readTextFile(Constant.FILEPATH + "sensor.txt");

        // 打印输出
        dataStream.print();

        env.execute();
    }
}
