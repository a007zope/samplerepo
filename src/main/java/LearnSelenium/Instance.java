package LearnSelenium;

public class Instance {

	String songName, singerName;

	public String setSong(String songName)
	{
		return this.songName=songName;

	}

	public String setSingerName(String singerName)
	{
		return this.singerName=singerName;
	}

	public void play()
	{
		System.out.println("playSong"+" "+songName);
		
		System.out.println("playsinger"+" "+singerName);

	}

	/*
	public void playMusic(String songName , String singerName){

		if(singerName.equals("eminem"))
		{
			System.out.println("Play Dont Be Afraid");
		}
		else if (singerName.equals("Akon"))
		{
			System.out.println("Play Beautiful");
		}

		else if(singerName.equals("Aditya")) 
		{
			System.out.println("Play Hanuman chalisa");
		}



	}
	 */
}
