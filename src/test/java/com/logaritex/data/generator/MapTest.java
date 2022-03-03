package com.logaritex.data.generator;

import com.logaritex.data.generator.DataGenerator;
import com.logaritex.data.generator.DataUtil;

public class MapTest {

	public static void main(String[] args) {
		DataUtil.print(new DataGenerator(
				DataUtil.uriToSchema("classpath:/avro/userguide/map0.yaml"), 3));

		DataUtil.print(new DataGenerator(
				DataUtil.uriToSchema("classpath:/avro/userguide/map1.yaml"), 3));
	}

}
