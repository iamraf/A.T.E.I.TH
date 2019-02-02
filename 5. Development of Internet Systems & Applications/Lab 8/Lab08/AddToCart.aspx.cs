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

namespace Lab08
{
    public partial class AddToCart : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if ((Request.QueryString["pid"] != null) && (Request.QueryString["Price"] != null) && (Request.QueryString["Quantity"]!=null))
            {
                if (Session["cart"] == null)
                    Session.Add("cart", new Cart());
                ((Cart)Session["cart"]).addItem(Request.QueryString["pid"], float.Parse(Request.QueryString["Price"]),int.Parse(Request.QueryString["Quantity"]));
            }
           Response.Redirect("ShowCart.aspx");
        }
    }
}
