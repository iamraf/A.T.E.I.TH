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

namespace Lab09
{
    public partial class AdminProducts : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
          /**  GridView2.Visible = true;
            DataSet1TableAdapters.productTableAdapter pta = new DataSet1TableAdapters.productTableAdapter();
            GridView2.DataSource = pta.GetData();
            GridView2.DataBind();**/

            if (Request.QueryString["id"] != null)
            {
                GridView1.Visible = true;
                GridView2.Visible = false;
            }
            else
            {
                GridView2.Visible = true;
                GridView1.Visible = false;
            }
        }
    }
}
