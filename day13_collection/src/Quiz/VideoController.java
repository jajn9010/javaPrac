package Quiz;

import java.util.Map;

public class VideoController {
	private static Integer i = new Integer(0);

	public static void addVideo(Map<Integer, Video> videos, Video v) {
		videos.put(++i, v);
	}

	public static void printList(Map<Integer, Video> videos) {
		System.out.println(videos);
	}

	public static void deleteVideo(Map<Integer, Video> videos, Integer i2) {
		videos.remove(i2);
	}

	public static void updateVideo(Map<Integer, Video> videos, Integer i2, Video v2) {
		// TODO Auto-generated method stub
		videos.put(i2, v2);
	}
	
	
}
