package ch14.collection.properties;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class JDBCExam {

	public static void main(String[] args) throws Exception {
		// properties 는 텍스트 문서를 java 코드의 k,v 형태로 불러온다
		
		Properties properties = new Properties(); // 빈 객체 생성
		String path = JDBCExam.class.getResource("jdbc.properties").getPath();
		// 파일의 위치 정보를 path 변수에 넣음
		System.out.println(path);
		path = URLDecoder.decode(path, "utf-8");
		// 파일에 한글이 있을수도 있으니  utf-8 처리
		properties.load(new FileReader(path));
		// 프로퍼티스로 불러옴.
		
		String driver = properties.getProperty("url");
		System.out.println("오라클 드라이버 : " + driver);
		
	} // main 종료

} // class 종료
