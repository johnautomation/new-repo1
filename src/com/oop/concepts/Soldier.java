package com.oop.concepts;

	public class Soldier extends Person {

		private String num, rank;

		public Soldier(String d_name, String num, String rank, String d_address) {

			super(d_name, d_address);
			this.num = num;
			this.rank = rank;
		}

		public void setNum(String num) {

			this.num = num;
		}

		public void setRank(String rank) {
			this.rank = rank;
		}

		public String getNum() {
			return num;
		}

		public String getRank() {
			return rank;
		}

		public static void main(String[] args) {

			// 1st soldier objects with d/f ranks

			Soldier sol1 = new Soldier("ashu", "two", "General", "111 frit ave");
			System.out.println(" Soldier1 name --- " + sol1.getName());
			System.out.println(" Soldier1 num --- " + sol1.getNum());
			System.out.println(" Soldier1 rank--- " + sol1.getRank());
			System.out.println(" Soldier1 address---- " + sol1.getAddress());

			System.out.println("-------------------------------------------");

			// 2nd soldier objects with d/f ranks

			Soldier sol2 = new Soldier("ashu", "two", "Cadet", "111 frit ave");
			System.out.println(" Soldier2 name --- " + sol2.getName());
			System.out.println(" Soldier2 num --- " + sol2.getNum());
			System.out.println(" Soldier2 rank--- " + sol2.getRank());
			System.out.println(" Soldier2 address---- " + sol2.getAddress());

			System.out.println("-------------------------------------------");

			// 1 soldier with different rank and num

			Soldier sol3 = new Soldier("chris", "Three", "major", "111 frit ave");
			System.out.println(" Soldier3 name --- " + sol3.getName());
			System.out.println(" Soldier3 num --- " + sol3.getNum());
			System.out.println(" Soldier3 rank--- " + sol3.getRank());
			System.out.println("Soldier3 address---- " + sol3.getAddress());

		}

	}


