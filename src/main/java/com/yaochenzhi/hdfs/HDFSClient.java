package com.yaochenzhi.hdfs;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HDFSClient {
	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException{
		
		Configuration conf = new Configuration();
//		conf.set("fs.defaultFS", "hdfs://192.168.1.11:9000");
//		
//		FileSystem fs = FileSystem.get(conf);
		FileSystem fs = FileSystem.get(new URI("hdfs://192.168.1.11:9000"), conf, "hadoop");
		
		fs.mkdirs(new Path("/com.yaochenzhi.hdfs/set_user"));
		
		fs.close();
		
		System.out.println("Well done!");
		
	}
}
