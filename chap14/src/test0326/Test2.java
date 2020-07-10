package test0326;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class SutdaCard {
	int num;
	boolean isKwang;

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public SutdaCard() {
		this(1, true);
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class SutdaDeck {
	List<SutdaCard> cards;
	Map<String, Integer> jokbo;

	SutdaDeck() {
		cards = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			cards.add(new SutdaCard(i % 10 + 1, (i == 0 || i == 2 || i == 7) ? true : false));
		}
		System.out.println(cards);
		jokbo = new HashMap<>();
		jokbo.put("KK", 4000);
		for (int i = 1; i <= 10; i++) {
			jokbo.put("" + i + i, 3000 + (i * 10));
		}
		jokbo.put("12", 2060);
		jokbo.put("21", 2060);
		jokbo.put("14", 2050);
		jokbo.put("41", 2050);
		jokbo.put("19", 2040);
		jokbo.put("91", 2040);
		jokbo.put("110", 2030);
		jokbo.put("101", 2030);
		jokbo.put("410", 2020);
		jokbo.put("104", 2020);
		jokbo.put("46", 2010);
		jokbo.put("64", 2010);
	}

	public void shuffle() {
		Collections.shuffle(cards);
//		System.out.println(cards);
	}

	public SutdaCard pick() {
		return cards.remove(0);
	}

	public void restart(Gambler g) {
		cards.add(g.c1);
		cards.add(g.c2);
	}
}

class Gambler {
	String name;
	SutdaCard c1, c2;
	SutdaDeck deck;

	public Gambler(String name, SutdaCard c1, SutdaCard c2, SutdaDeck deck) {
		this.name = name;
		this.c1 = c1;
		this.c2 = c2;
		this.deck = deck;
	}

	public String toString() {
		return name + "(" + c1 + "," + c2 + "):" + getScore();
	}

	int getScore() {
		Integer score = null;
		if (c1.isKwang && c2.isKwang) {
			score = deck.jokbo.get("KK");
		} else {
			score = deck.jokbo.get("" + c1.num + c2.num);
			if (score == null) {
				score = (c1.num + c2.num) % 10;
			}
		}
		return score;
	}

	public void pick() {
		c1 = deck.pick();
		c2 = deck.pick();
	}
}

public class Test2 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		Gambler g1 = new Gambler("Å¸ÀÚ", deck.pick(), deck.pick(), deck);
		Gambler g2 = new Gambler("°í¼ö", deck.pick(), deck.pick(), deck);
		int cnt1=0,cnt2=0;
		for (int i = 1; i <= 10; i++) {
			deck.shuffle();
			g1.pick();
			g2.pick();
			System.out.print(g1.getScore() + ":" + g2.getScore() + "=>");
			if (g1.getScore() > g2.getScore()) {
				System.out.println(g1.name + "½Â¸®");
				cnt1++;
			} else if (g1.getScore() < g2.getScore()) {
				System.out.println(g2.name + "½Â¸®");
				cnt2++;
			} else {
				System.out.println(g1.name + "°ú" + g2.name + " ºñ±è.");
			}
			deck.restart(g1);
			deck.restart(g2);
		}
		System.out.println(g1.name + "½ÂÁ¡:" + cnt1);
		System.out.println(g2.name + "½ÂÁ¡:" + cnt2);
		System.out.println
		((cnt1 > cnt2)?g1.name+"½Â¸®":(cnt1 < cnt2)?g2.name+"½Â¸®":"ºñ±è" );
	}
}
