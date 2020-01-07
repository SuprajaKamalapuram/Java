package comm.example;

import java.time.LocalDate;


public class Task {
	private String taskId;
	private String taskName;
	private LocalDate taskDate;
	private boolean isCompleted;
	
	
	public Task(String taskId, String taskName, LocalDate taskDate, boolean isCompleted) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.taskDate = taskDate;
		this.isCompleted = isCompleted;
	}
	

	


	@Override
	public String toString() {
		return "Task [taskName=" + taskName + ", taskId=" + taskId + ", taskDate=" + taskDate + ", isCompleted="
				+ isCompleted + "]";
	}





	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (isCompleted != other.isCompleted)
			return false;
		if (taskDate == null) {
			if (other.taskDate != null)
				return false;
		} else if (!taskDate.equals(other.taskDate))
			return false;
		if (taskName == null) {
			if (other.taskName != null)
				return false;
		} else if (!taskName.equals(other.taskName))
			return false;
		return true;
	}*/
		
		Task myTask = null;
		boolean isEqual=false;
		if (obj instanceof Task) {
			myTask = (Task) obj;
		}
		if((this.getTaskName()==myTask.getTaskName()) &&
				(this.getTaskDate().equals(((Task) obj).getTaskDate())&&(this.isCompleted()==myTask.isCompleted())))
		{
			isEqual=true;
		}
		return isEqual;
	}


	public String getTaskId() {
		return taskId;
	}
	
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate localDate) {
		this.taskDate = localDate;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}


}
