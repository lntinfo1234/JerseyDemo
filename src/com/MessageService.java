package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class MessageService {
	static Map<Integer,Message> messages = new HashMap<>();
	static {
		messages.put(1,new Message(1,"Hetal",LocalDate.of(2019, 12,12)));
		
		messages.put(2,new Message(2,"Mitali",LocalDate.of(2019, 4, 1)));
		messages.put(3,new Message(3,"Sweta",LocalDate.of(2019, 8, 4)));
		messages.put(4,new Message(4,"Shweta",LocalDate.of(2019, 9, 5)));

		
	}
	public List<Message> getAllMessages()
	{
		Collection <Message> coll = messages.values();
		 List<Message> msgList  = new ArrayList<>(coll);
		 return msgList;
		 
		}

		public Message getMessageById(int id) {
		 
		 return messages.get(id);
		 
		}

		public Message addMessage(Message m) {
		 int sizeofcoll = messages.size();
		 int newid = sizeofcoll + 1;
		 messages.put(newid, m);
		 return m;
		 
		}


		public Message delMessage(int id) {
		 messages.remove(id);
		 return getMessageById(id);
		}

		public Message updateMessage(Message m) {
		 
		 messages.put(m.getId(), m);
		 return m;
		 
		}

		public static void main(String[] args) {
		 // TODO Auto-generated method stub

		}


}
