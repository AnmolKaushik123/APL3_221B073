public class Singleton
{
  private static final Singleton instance = new Singleton();

  private Singleton()
  {
    // private constructor
  }
  public static Singleton getInstance(){
        return instance;
    }
}
