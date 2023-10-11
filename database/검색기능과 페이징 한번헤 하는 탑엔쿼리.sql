//검색

@Override
	public List<NoticeDto> selectListByPage(String type, String keyword, int page) {
		int begin = page * 10 - 9;
		int end = page * 10;

		String sql =	" SELECT * "
			     +"FROM (SELECT *  FROM 테이블명"
			    	     +" where instr(" + type + ", ?) > 0 "
			    	          +" ORDER BY 기본키_no DESC)"
			    	    +" WHERE ROWNUM between ? and ?";	
		
		Object[] ob = { keyword, begin, end };
		return tem.query(sql, noticeMapper, ob);
	}


//비검색
  
@Override
	public List<NoticeDto> selectListByPage(int page) {
	
		String sql = "select * from ("
				+ "select rownum rn, TMP.* from("
				+ "select * from 테이블명 order by 기본키_no desc"
				+ ")TMP"
				+ ") where rn between ? and ?";
		Object[] ob = { page * 10 - 9, page * 10 };
		return tem.query(sql,noticeMapper , ob);

	}
