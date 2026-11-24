
public class VideoPlayer implements PlaybackController{
	
	@Override
	public void play() {
		System.out.println("通常再生します");
	}
	
	@Override
	public void playDoubleSpeed() {
		System.out.println("2倍速で再生します");
	}
	
	@Override
	public void stop() {
		System.out.println("再生を停止します");
	}
}
