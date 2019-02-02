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
using System.Data.OleDb;
namespace Lab08
{
    public partial class ProductInfo : System.Web.UI.Page
    {
        private int id=-1;
        protected void Page_Load(object sender, EventArgs e)
        {
            viewProdInfo();
        }

        protected void viewProdInfo()
        {
            string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source="
    + Server.MapPath("~/ebookstoredb.mdb");
            using (OleDbConnection con = new OleDbConnection(conString))
            {
                con.Open();
                string query = "SELECT * FROM product where ID=@id";
                using (OleDbCommand cmd = new OleDbCommand(query, con))
                {
                    cmd.Parameters.AddWithValue("@id", Request.QueryString["book_id"]);
                    OleDbDataReader rdr = cmd.ExecuteReader();
                    rdr.Read();
                    id = rdr.GetInt32(0);
                    BookNameL.Text = rdr.GetString(1);
                    BookDescriptionL.Text = rdr.GetString(2);
                    BookPriceL.Text = rdr.GetFloat(3).ToString();
                }
                con.Close();
            }
        }

        protected void B1Click(object sender, EventArgs e)
        {
            string rr = "AddToCart.aspx?pid=" + id + "&Price=" + BookPriceL.Text + "&Quantity=" + BookQuantityL.Text;
            Response.Redirect(rr);
        }
    }
}
