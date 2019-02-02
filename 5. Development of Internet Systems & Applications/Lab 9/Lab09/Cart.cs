using System;
using System.Collections;

public class Cart
{
	public Cart()
	{
        items = new ArrayList();
    }
    public void addItem(string ProductID, double Price, int Quantity)
    {
        items.Add(new CartItem(ProductID, Price, Quantity));
    }
    public ArrayList getItems()
    {
        return  items;
    }
    ArrayList items;
    
}

public class CartItem
{
    public string ProductID;
    public double Price;
    public int Quantity;
    public CartItem(string prodID, double ProdPrice, int Quan)
    {
        ProductID = prodID;
        Price = ProdPrice;
        Quantity = Quan;
    }
}


