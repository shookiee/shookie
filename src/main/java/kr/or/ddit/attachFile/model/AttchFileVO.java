package kr.or.ddit.attachFile.model;

public class AttchFileVO {

	private int fileId;	// 파일 아이디
	private int postId;	// 게시글 아이디
	private String filePath;	// 파일 경로
	private String fileName;	// 파일명
	
	public AttchFileVO() {

	}

	public AttchFileVO(int fileId, int postId, String filePath, String fileName) {
		super();
		this.fileId = fileId;
		this.postId = postId;
		this.filePath = filePath;
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		return "AttchFileVO [fileId=" + fileId + ", postId=" + postId
				+ ", filePath=" + filePath + ", fileName=" + fileName + "]";
	}

	public int getFileId() {
		return fileId;
	}

	public void setFileId(int fileId) {
		this.fileId = fileId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
