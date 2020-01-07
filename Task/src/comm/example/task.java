package comm.example;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class task {
	private String taskID;
	private String taskname;
	private String author;
	
	
	
	public task createtask(String author,String taskname) {
		task Task=new task(); 
		setTaskname(taskname);
		setAuthor(author);
		setTaskID(UUID.randomUUID().toString());
		return Task;
		
	}
	
	public String getTaskDetails(){
		
		return "Task Id:" +getTaskID()+ "Task name:" +getTaskname()+ "Created By:" +getAuthor(); 
	}
	
	
	





	public String getTaskID() {
		return taskID;
	}
	
	public void setTaskID(String taskID) {
		this.taskID = taskID;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

	

}
