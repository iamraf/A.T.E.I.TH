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

namespace Lab06
{
    public partial class Login : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void LoginSubmit(object sender, EventArgs e)
        {
            if (usernameTB.Text == "admin" && passwordTB.Text == "admin")
            {
                Session["user"] = usernameTB.Text;
                Response.Redirect("Default.aspx");
            }
            else if (usernameTB.Text=="kostas" && passwordTB.Text == "123")
            {
                Session["user"] = usernameTB.Text;
                Response.Redirect("Default.aspx");
            }
            else
            {
                errorL.Text = "Lathos onoma/kodikos!";
            }
        }
    }
}
