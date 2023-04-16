package Quiz;

import java.util.Map;

public class VideoController {
	private static Integer i = new Integer(0);

	protected static void addVideo(Map<Integer, Video> videos, Video v) {
		videos.put(++i, v);
	}

	protected static void printList(Map<Integer, Video> videos) {
		System.out.println(videos);
	}

	protected static void deleteVideo(Map<Integer, Video> videos, Integer i2) {
		videos.remove(i2);
	}

	protected static void updateVideo(Map<Integer, Video> videos, Integer i2, Video v2) {
		videos.put(i2, v2);
	}
	
	
}
