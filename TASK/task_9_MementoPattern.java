public class Article 
{
  private long id;
  private String title;
  private String content;
   
  public Article(long id, String title) {
    super();
    this.id = id;
    this.title = title;
  }
   

   
  public ArticleMemento createMemento() 
  {
    ArticleMemento m = new ArticleMemento(id, title, content);
    return m;
  }
   
  public void restore(ArticleMemento m) {
    this.id = m.getId();
    this.title = m.getTitle();
    this.content = m.getContent();
  }
 
  @Override
  public String toString() {
    return "Article [id=" + id + ", title=" + title + ", content=" + content + "]";
  }
}
public final class ArticleMemento 
{
  private final long id;
  private final String title;
  private final String content;
   
  public ArticleMemento(long id, String title, String content) {
    super();
    this.id = id;
    this.title = title;
    this.content = content;
  }
 
  public long getId() {
    return id;
  }
 
  public String getTitle() {
    return title;
  }
 
  public String getContent() {
    return content;
  }
}

public class Main 
{
  public static void main(String[] args) 
  {
    Article article = new Article(1, "My Article");
    article.setContent("ABC");    
    System.out.println(article);
     
    ArticleMemento memento = article.createMemento(); 
     
    article.setContent("123");    
    System.out.println(article);
     
    article.restore(memento);   
    System.out.println(article);  
  }
}
