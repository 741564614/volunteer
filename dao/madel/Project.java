package dao.madel;

import java.util.Date;

public class Project {
	private String id;
	private String projectname;
	private Date starttime;
	private Date endtime;
	private String site;
	private String content;
	private int hour;
	private String pic;
	private String state;
	private String term;
	public void setid(String id) {
		this.id=id;
	}
	public void setprojectname(String projectname) {
		this.projectname=projectname;
	}
	public void setstarttime(Date starttime) {
		this.starttime=starttime;
	}
	public void setendtime(Date endtime) {
		this.endtime=endtime;
	}
	public void setsite(String site) {
		this.site=site;
	}
	public void setcontent(String content) {
		this.content=content;
	}
	public void sethour(int hour) {
		this.hour=hour;
	}
	public String getid() {
		return id;
	}
	public void setstate(String state) {
		this.state=state;
	}
	public String getstate() {
		return state;
	}
	public void setterm(String term) {
		this.term=term;
	}
	public String getterm() {
		return term;
	}
	public String getprojectname() {
		return projectname;
	}
	public Date getstarttime() {
		return starttime;
	}
	public Date getendtime() {
		return endtime;
	}
	public String getsite() {
		return site;
	}
	public String getcontent() {
		return content;
	}
	public int gethour() {
		return hour;
	}
	public void setpic(String pic) {
		this.pic=pic;
	}
	public String getpic() {
		return pic;
	}
}
