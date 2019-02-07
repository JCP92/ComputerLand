public class Driver	{
    public static void main(String[]	args)	{
        Computer c1 = new Computer("56232");	//	provide	only	serial	number
        Computer c2 = new Computer("23291", "Intel");	//	provide	both

        System.out.println("All	monitors have the resolution: " +Monitor.RESOLUTION);

        Monitor m = new Monitor();
        c1.setMonitor(m);
        c2.setMonitor(m);
        c1.getMonitor().setDisplay("Welcome to the new Library!");

        System.out.println(c1);
        System.out.println(c2);

        c1.getMonitor().clear();
        c2.setGbMemory(16);
        c1.setGbStorage(200);

        c2.getMonitor().setDisplay("Good afternoon!");

        System.out.println(c1);
        System.out.println(c2);
    }
}

