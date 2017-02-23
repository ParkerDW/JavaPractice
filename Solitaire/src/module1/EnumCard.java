package module1;

public enum EnumCard 
{
	ACE_SPADES, TWO_SPADES, THREE_SPADES, FOUR_SPADES, FIVE_SPADES, SIX_SPADES, SEVEN_SPADES, EIGHT_SPADES, NINE_SPADES, TEN_SPADES, JACK_SPADES, QUEEN_SPADES, KING_SPADES, 
	ACE_CLUBS, TWO_CLUBS, THREE_CLUBS, FOUR_CLUBS, FIVE_CLUBS, SIX_CLUBS, SEVEN_CLUBS, EIGHT_CLUBS, NINE_CLUBS, TEN_CLUBS, JACK_CLUBS, QUEEN_CLUBS, KING_CLUBS, 
	ACE_HEARTS, TWO_HEARTS, THREE_HEARTS, FOUR_HEARTS, FIVE_HEARTS, SIX_HEARTS, SEVEN_HEARTS, EIGHT_HEARTS, NINE_HEARTS, TEN_HEARTS, JACK_HEARTS, QUEEN_HEARTS, KING_HEARTS, 
	ACE_DIAMONDS, TWO_DIAMONDS, THREE_DIAMONDS, FOUR_DIAMONDS, FIVE_DIAMONDS, SIX_DIAMONDS, SEVEN_DIAMONDS, EIGHT_DIAMONDS, NINE_DIAMONDS, TEN_DIAMONDS, JACK_DIAMONDS, QUEEN_DIAMONDS, KING_DIAMONDS;
	
	public enum Suit
	{
		SPADES, CLUBS, HEARTS, DIAMONDS;
		
		public enum Color 
		{
			BLACK, RED;
		}
		
		public Color getColor()
		{
			if (this == CLUBS || this == SPADES) 
				return Color.BLACK;
			
			else 
				return Color.RED;
		}
		
		public String toString()
	    {
			return name().substring(0,1) + name().substring(1, name().length()).toLowerCase();
	    }
	}
	
	public enum Rank		
	{
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	}
	
	public boolean suitIsEquals(Suit s)
	{
		return s.equals(Suit.values() [ordinal() / Rank.values().length]);
	}
	public Suit getSuit()
	{
		return Suit.values() [ordinal() / Rank.values().length];
	}
	
	public Rank getRank()
	{
		return Rank.values() [ordinal() % Rank.values().length];
	}
}	