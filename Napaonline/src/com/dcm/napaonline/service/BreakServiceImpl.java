package com.dcm.napaonline.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dcm.napaonline.dao.BreakDao;
import com.dcm.napaonline.model.Break;
@Service
@Transactional
public class BreakServiceImpl implements BreakService{
	@Autowired
	private BreakDao breakDao;

	@Override
	public void indexBreaks() throws Exception {
		breakDao.indexBreaks();
		
	}

	@Override
	public void addBreaks(Break breaks) {
		breakDao.addBreaks(breaks);
		
	}

	@Override
	public List<Break> searchForBreak(String text) throws Exception {
		return breakDao.searchForBreak(text);
		 
	}

}
