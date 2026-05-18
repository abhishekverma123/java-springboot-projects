package com.social.media.application.Social.Media.Application;

import java.util.ArrayList;

public class SimplePostList implements PostList {
	
	ArrayList<Post> postList;
      public SimplePostList() {
    	    this.postList = new ArrayList<Post>(); 
      }
      

      public void init() {
    	  
    	  Post post = new SimplePost();
    	  post.setMessage("Random Post From DB");
    	  postList.add(post);
    	
    	 
    	  
         // System.out.println();
      }
      
      
	@Override
	public ArrayList<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return this.postList;
	}

	@Override
	public Post getPost(int i) {
		// TODO Auto-generated method stub
		return this.postList.get(i);
	}

	@Override
	public void setPost(Post post) {
		// TODO Auto-generated method stub
		this.postList.add(post);

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.postList.size();
	}
	public void destroy() {
        System.out.println("Post List Bean is Destroyed or DB connection is closed");
    }
}
