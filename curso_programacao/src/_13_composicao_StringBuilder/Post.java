package _13_composicao_StringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
 private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");// constante para data
 private Date moment;
 private String title;
 private String content;
 private Integer likes;
 //associação
 //lista não tem o setXXX e tem add e remove. Instancia e não coloca no construtor
 private List<Comment> comments = new ArrayList<>(); //composição: pode ter 1 ou mais comments
 
	public Post() {
		super();
	}

	//construtor sem a lista
	public Post(Date moment, String title, String content, Integer likes) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
		
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	

	public List<Comment> getComments() {
		return comments;
	}

	/*
	 * não pode ter: trocaria a lista
	 * public void setComments(List<Comment> comments) { this.comments = comments; }
	 */

	public void addComment(Comment c) {
		comments.add(c);
	}
	
	public void removeComment(Comment c) {
		comments.remove(c);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" title= " + title + "\n");
		sb.append(" likes= " + likes);
		sb.append(" -  moment=" + sdf.format(moment) + "\n");
		sb.append(" content= " + content + "\n");
		//para os comentarios
		for(Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString();
	} 
	
	
	
}
