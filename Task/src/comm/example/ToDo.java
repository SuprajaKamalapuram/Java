package comm.example;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter


public class ToDo {
	private task Task;
	private String toDoID;
	private boolean isCompleted;
	private RandomFortune fortune;
	private LocalDate date;
	public ToDo(task Task) {
		this.Task=Task;
		
	}
	


	public ToDo() {
		// TODO Auto-generated constructor stub
	}



	public ToDo createToDo(String author,String taskname,boolean isCompleted) {
	/*if(Task==null){
		System.out.println("can't create task existing system");
		System.exit(0);
	}
	if(fortune==null)
	{
		System.out.println("bad day today..try again");
		System.exit(0);
	}*/
		Task=new task();
		ToDo todo=new ToDo();
	    //System.out.println("Daily Fortune:" +fortune.getDailyFortune());
		System.out.println("creating a new task");
		Task=Task.createtask(author,taskname);
		System.out.println("successfully created task");
		setToDoID(UUID.randomUUID().toString());
		setDate(LocalDate.now());
		setCompleted(isCompleted);
		return todo;
	}
	public String getToDoDetails() {
		
		return Task.getTaskDetails()+"todo id:"+getToDoID()+"todo date:" +getDate()+"completed:"+isCompleted;		
	}
	
	
	
	
	
	
	

	public task getTask() {
		return Task;
	}

	public void setTask(task task) {
		Task = task;
	}

	public String getToDoID() {
		return toDoID;
	}

	public void setToDoID(String toDoID) {
		this.toDoID = toDoID;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
