package INTERFACE;

public class OracleDao implements DataAccessObject {
		@Override
		public void select() {
			System.out.println("Oracle에서 DB 검색");
			
		}
		@Override
		public void insert() {
			System.out.println("Oracle에서 DB 삽입");
			
		}
		@Override
		public void update() {
			System.out.println("Oracle에서 DB 수정");
			
		}
		@Override
		public void delete() {
			System.out.println("Oracle에서 DB 삭제");
			
		}
		

}
