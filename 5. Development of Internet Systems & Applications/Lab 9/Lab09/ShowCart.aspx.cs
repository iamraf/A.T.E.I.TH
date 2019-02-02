using System;
using System.Collections;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Web.UI.HtmlControls;
using System.Xml.Linq;

namespace Lab07
{
    public partial class ShowCart : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Session["cart"] != null)
            {
                Literal1.Text = "<table class='table table-striped'><tr><td>Κωδικός</td><td>Τίτλος Βιβλίου</td><td>Ποσοτητα</td><td>Τιμή</td></tr>";
                Cart myCart = new Cart();
                CartItem tempItem;
                myCart = (Cart)Session["cart"];
                double sum=0;
                for (int i = 0; i < myCart.getItems().Count; i++)
                {
                    tempItem = (CartItem)myCart.getItems()[i];
                    
                    Literal1.Text += "<tr><td>" + tempItem.ProductID + "</td>";
                    Literal1.Text += "<td>" + tempItem.ProductID + "</td>";
                    Literal1.Text += "<td>" + tempItem.Quantity + "</td>";
                    Literal1.Text += "<td>" + (tempItem.Quantity*tempItem.Price) + "</td></tr>";
                    sum += (tempItem.Quantity * tempItem.Price);
                }
                Literal1.Text += "<tr><td>Συνολο: " + sum + "<td></td></td><td></td><td></td></tr>";
                Literal1.Text += "</table>";
            }
        }
    }
}

