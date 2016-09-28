package org.sharegov.cirm.utils;

import java.util.List;

import org.semanticweb.owlapi.model.OWLOntologyChange;
	
	public class OntologyCommit {
		private long timeStamp;
		
		public long getTimeStamp() {
			return timeStamp;
		}

		public void setTimeStamp(long timeStamp) {
			this.timeStamp = timeStamp;
		}

		private String userName, comment;
		
		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public List<OWLOntologyChange> getChanges() {
			return changes;
		}

		public void setChanges(List<OWLOntologyChange> changes) {
			this.changes = changes;
		}

		private List <OWLOntologyChange> changes;
		
		public OntologyCommit (String userName, String comment, List <OWLOntologyChange> changes, long timeStamp){
			this.userName = userName;
			this.comment = comment;
			this.changes = changes;
			this.timeStamp = timeStamp;
		}
	}