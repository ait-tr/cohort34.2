<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>English</b></summary>



</details>

<hr>

<details style="margin-top: 16px">
  <summary style="cursor: pointer; color: blue;"><b>На русском</b></summary>

1. Создайте класс `Playlist`, который реализует `Iterable` и содержит список песен. Реализовать итератор, который
   позволяет переключаться между песнями.

2. Создайте enum `WaterCycleStages` с этапами круговорота воды (испарение, конденсация, осадки). Реализуйте `Iterable`
   для перечисления, позволяющий пользователю перебирать этапы цикла.

3. Сделать самостоятельную реализацию приложения Forum.

````java
public interface Forum {

    boolean addPost(Post post);

    boolean removePost(int postId);

    boolean updatePost(int postId, String newContent);

    Post getPostById(int postId);

    Post[] getPostsByAuthor(String author);

    Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo);

    int size();

}


public class ForumImpl implements Forum {

    // code...

}


class ForumImplTest {
    Forum forum;
    Post[] posts = new Post[6];

    @BeforeEach
    void setUp() {
        forum = new ForumImpl();
        posts[0] = new Post(0, "author1", "title1", "content");
        posts[1] = new Post(1, "author2", "title2", "content");
        posts[2] = new Post(2, "author2", "title3", "content");
        posts[3] = new Post(3, "author1", "title4", "content");
        posts[4] = new Post(4, "author3", "title1", "content");
        posts[5] = new Post(5, "author1", "title2", "content");
        for (int i = 0; i < posts.length - 1; i++) {
            forum.addPost(posts[i]);
        }
    }

    @Test
    void addPost() {
        //TODO assert throw if forum.addPost(null)
        boolean flag;
        try {
            forum.addPost(null);
            flag = true;
        } catch (RuntimeException e) {
            flag = false;
        }
        assertFalse(flag);
        assertTrue(forum.addPost(posts[5]));
        assertEquals(6, forum.size());
        assertFalse(forum.addPost(posts[5]));
        assertEquals(6, forum.size());
    }

    @Test
    void removePost() {
        assertTrue(forum.removePost(2));
        assertEquals(4, forum.size());
        assertFalse(forum.removePost(2));
        assertEquals(4, forum.size());
    }

    @Test
    void updatePost() {
        assertTrue(forum.updatePost(1, "new content"));
        assertEquals("new content", forum.getPostById(1).getContent());
    }

    @Test
    void getPostById() {
        assertEquals(posts[3], forum.getPostById(3));
        assertNull(forum.getPostById(5));
    }

    @Test
    void getPostsByAuthor() {
        Post[] actual = forum.getPostsByAuthor("author1");
        Arrays.sort(actual);
        Post[] expected = {posts[0], posts[3]};
        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));
        // assertArrayEquals(expected, actual);
    }

    @Test
    void testGetPostsByAuthor() {
        posts[0].setDate(LocalDateTime.now().minusDays(6));
        posts[1].setDate(LocalDateTime.now().minusDays(9));
        posts[2].setDate(LocalDateTime.now().minusDays(5));
        posts[3].setDate(LocalDateTime.now().minusDays(7));
        posts[4].setDate(LocalDateTime.now().minusDays(10));
        posts[5].setDate(LocalDateTime.now().minusDays(8));
        forum = new ForumImpl();
        for (int i = 0; i < posts.length; i++) {
            forum.addPost(posts[i]);
        }
        Post[] actual = forum.getPostsByAuthor("author1", LocalDate.now().minusDays(11), LocalDate.now().minusDays(6));
        Arrays.sort(actual);
        Post[] expected = {posts[0], posts[3], posts[5]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void size() {
        assertEquals(5, forum.size());
    }
}

public class Post {

    private int postId;
    private String title;
    private String author;
    private String content;
    private LocalDateTime date;
    private int likes;

    // коснтруктор и прочие методы


    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                ", likes=" + likes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;  // вернем false, когда сравниваем с null или с объектом другого класса
        Post post = (Post) o;
        return postId == post.postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId);
    }
}

````

4.

</details>
