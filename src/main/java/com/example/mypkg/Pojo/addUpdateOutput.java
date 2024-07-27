package com.example.mypkg.Pojo;

public class addUpdateOutput {

	private String responseMsg;
	private Long bookId;
	
	public addUpdateOutput() {}
	
	
	public addUpdateOutput(String responseMsg, Long bookId) {
		this.responseMsg = responseMsg;
		this.bookId = bookId;
	}
	
	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public Long getbookId() {
		return bookId;
	}

	public void setRowId(Long bookId) {
		this.bookId = bookId;
	}
	
}
