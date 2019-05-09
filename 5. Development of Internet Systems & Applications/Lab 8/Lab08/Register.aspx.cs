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
    public partial class Register : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                MultiView1.ActiveViewIndex = 0;
            }
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            MultiView1.ActiveViewIndex = 1;
            OnomaL.Text = OnomaTB.Text;
            EponymoL.Text = EponymoTB.Text;
            EmailL.Text = EmailTB.Text;
            DieuthinsiL.Text = DieuthinsiTB.Text;
            ThlefonoL.Text = ThlefonoTB.Text;
            TKL.Text = TKTB.Text;
            PoliL.Text = PolhTB.Text;
            ChoraL.Text = ChoraDDL.Text;
            FulloL.Text = FulloRBL.Text;
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            Response.Redirect("Login.aspx");
        }
    }
}
