
public class Lazy 
{
  private static Lazy instance;

  private Lazy() 
  {
  }
  public static Lazy getInstance() 
  {
    if (instance == null) 
    {
      // if instance is null, initialize
      instance = new Lazy();
    }
    return instance;
  }
}
