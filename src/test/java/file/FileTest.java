package file;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append(System.getProperty("user.home"))
			.append(java.io.File.separator)
			.append(".crossRedis")
			.append(java.io.File.separator)
			.append("logs")
			.append(java.io.File.separator);
		String logFolder = sb.toString();
		File file = new File(logFolder);
		if (file.exists()) {
			if (!file.isDirectory()) {
				file.delete();
			}
		} else {
			file.mkdirs();
		}

		boolean exists = file.exists();
		System.out.println(exists);

	}
}
