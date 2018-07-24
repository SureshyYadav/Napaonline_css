package com.dcm.napaonline.dao;

import java.util.List;

import com.dcm.napaonline.model.Break;

public interface BreakDao {
	public void indexBreaks() throws Exception;
	public void addBreaks(Break breaks);
	public List<Break> searchForBreak(String text) throws Exception;

}
