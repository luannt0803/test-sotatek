package commons;

public class GlobalConstants {
	public static final String PROJECT_LOCATION = System.getProperty("user.dir");
	public static final String BROWSER_EXTENSION_FOLDER = PROJECT_LOCATION + "\\browserExtensions";
	public static final String OS_NAME = System.getProperty("os.name");
	public static final String UPLOAD_FOLDER_LOCATION = PROJECT_LOCATION + "\\uploadFiles";
	public static final String DOWNLOAD_FOLDER_LOCATION = PROJECT_LOCATION + "\\downloadFiles";

	public static final long SHORT_TIMEOUT = 5;
	public static final long LONG_TIMEOUT = 30;
}
