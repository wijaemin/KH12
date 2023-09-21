//검색

@Override
	public List<NoticeDto> selectListByPage(String type, String keyword, int page) {
		int begin = page * 10 - 9;
		int end = page * 10;

		String sql =	" SELECT * "
			     +"FROM (SELECT *  FROM notice"
			    	     +" where instr(" + type + ", ?) > 0 "
			    	          +" ORDER BY notice_no DESC)"
			    	    +" WHERE ROWNUM between ? and ?";	
		
		Object[] ob = { keyword, begin, end };
		return tem.query(sql, noticeMapper, ob);
	}


//비검색
  
@Override
	public List<NoticeDto> selectListByPage(int page) {
	
		String sql = "select * from ("
				+ "select rownum rn, TMP.* from("
				+ "select * from notice order by notice_no desc"
				+ ")TMP"
				+ ") where rn between ? and ?";
		Object[] ob = { page * 10 - 9, page * 10 };
		return tem.query(sql,noticeMapper , ob);

	}
