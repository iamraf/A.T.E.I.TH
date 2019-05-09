using System;
using System.Collections;
using System.Configuration;
using System.Data;
using System.Linq;
using System.Web;
using System.Web.Security;
using System.Web.UI;
using System.Web.UI.HtmlControls;
using System.Web.UI.WebControls;
using System.Web.UI.WebControls.WebParts;
using System.Xml.Linq;

namespace Lab07 
{
    public partial class MasterPage : System.Web.UI.MasterPage
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            fillLeftMenu();
        }
        protected void fillLeftMenu()
        {
            if ((string)Session["user"] == "admin")
            {
                adminMenu.Visible = true;
                userMenu.Visible = false;
            }
            else if (Session["user"] != null)
            {
                adminMenu.Visible = false;
                userMenu.Visible = true;
            }
            else
            {
                adminMenu.Visible = false;
                userMenu.Visible = false;
            }
        }
        protected void HomeB(object sender, EventArgs e)
        {
            Response.Redirect("Default.aspx");
        }
        protected void AboutB(object sender, EventArgs e)
        {
            Response.Redirect("About.aspx");
        }
        protected void ProductsB(object sender, EventArgs e)
        {
            Response.Redirect("Products.aspx");
        }
        protected void ShowCartB(object sender, EventArgs e)
        {
            Response.Redirect("ShowCart.aspx");
        }
        protected void LoginB(object sender, EventArgs e)
        {
            Response.Redirect("Login.aspx");
        }
        protected void adminCat(object sender, EventArgs e)
        {
            Response.Redirect("AdminCategories.aspx");
        }
        protected void adminPro(object sender, EventArgs e)
        {
            Response.Redirect("AdminProducts.aspx");
        }
        protected void adminOrd(object sender, EventArgs e)
        {
            Response.Redirect("adminOrders.aspx");
        }
        protected void Logout(object sender, EventArgs e)
        {
            Response.Redirect("Logout.aspx");
        }
        protected void CustomerInfo(object sender, EventArgs e)
        {
            Response.Redirect("MyDetails.aspx");
        }
        protected void CustomerOrders(object sender, EventArgs e)
        {
            Response.Redirect("MyOrders.aspx");
        }
    }
}
