package co.twibble.dao;

import co.twibble.model.Post;

import java.util.List;

/**
 * The UserDAO class
 *
 * @author  Andy McCall
 * @version 0.2
 * @since   2017-02-22
 */
public interface PostDAO {
    public void addPost(Post post);
    public void updatePost(Post post);
    public Post getPostById(int postId);
    public List<Post> getAllPosts();
    public List<Post> getPostByUsername(String userName);
    public List<Post> getPostByPath(int year, int month, int day, String postName);
    public List<Post> getPostByYear(int year);
    public List<Post> getPostByYearMonth(int year, int month);
    public List<Post> getPostByYearMonthDay(int year, int month, int day);
    public List<Post> getPostByPage(int pageNumber, int numberOfPosts);
    public int getNumberOfPosts();

}
