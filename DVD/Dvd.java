package DVD;

import java.time.LocalDateTime;

public class Dvd {
	private String name;
	private LocalDateTime time;
	public boolean out;
	private int count;
	public Dvd(String name)
	{
		this.name=name;
		this.out=false;
		this.count=0;
		this.time=LocalDateTime.now();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public void setTime() {
		this.time = LocalDateTime.now();
	}
	public boolean isStatue() {
		return out;
	}
	public void setStatue(boolean statue) {
		this.out = statue;
	}
	public int getCount() {
		return count;
	}
	public void addCount() {
		this.count++;
	}
	
}
