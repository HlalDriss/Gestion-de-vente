package org.comm.enties;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Users")
public class User {
	   @Id
	    private int codeUser;

	    private String username;

	    private String psw;

	    private String name;
		//mapping**************************************************
//	    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL )
//	    private List<Commande> cmds;
//   

	    public User() {
			super();
		}

		public User(int codeUser, String username, String psw, String name/*, List<Commande> cmds*/) {
			super();
			this.codeUser = codeUser;
			this.username = username;
			this.psw = psw;
			this.name = name;
			//this.cmds = cmds;
		}

	
		public int getCodeUser() {
			return codeUser;
		}

		public void setCodeUser(int codeUser) {
			this.codeUser = codeUser;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPsw() {
			return psw;
		}

		public void setPsw(String psw) {
			this.psw = psw;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

//		public List<Commande> getCmds() {
//			return cmds;
//		}
//
//		public void setCmds(List<Commande> cmds) {
//			this.cmds = cmds;
//		}
}
