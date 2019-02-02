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

namespace Lab07
{
    public partial class Products : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            viewCategories();
            if (Request.QueryString["id"] != null)
            {
                viewProducts();
            }
        }

        protected void viewCategories()
        {
            string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source="
                + Server.MapPath("~/ebookstoredb.mdb");
            using (OleDbConnection con = new OleDbConnection(conString))
            {
                con.Open();
                string query = "SELECT * FROM category ";
                using (OleDbCommand cmd = new OleDbCommand(query, con))
                {
                    OleDbDataReader reader = cmd.ExecuteReader();
                    Literal1.Text = "<ul>";
                    while (reader.Read())
                    {
                        Literal1.Text += "<li><a href='?id="+reader["id"]+"'>"+reader["name"]+"</a></li>";
                    }
                    Literal1.Text += "</ul>";
                }
                con.Close();
            }
        }

        protected void viewProducts()
        {
            string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source="
                + Server.MapPath("~/ebookstoredb.mdb");
            using (OleDbConnection con = new OleDbConnection(conString))
            {
                con.Open();
                string query = "SELECT * FROM product where category=@id";
                using (OleDbCommand cmd = new OleDbCommand(query, con))
                {
                    cmd.Parameters.AddWithValue("@id", Request.QueryString["id"]);
                    OleDbDataReader reader = cmd.ExecuteReader();
                    Literal2.Text = "<table>";
                    Literal2.Text += "<th>Βιβλιο</th><th>Τιμη</th>";
                    while (reader.Read())
                    {
                        Literal2.Text += "<tr><td><a href='ProductInfo.aspx?book_id=" + reader["id"] + "'>" + reader["title"] + "</a></td>";
                        Literal2.Text += "<td> "+ reader["price"] + "</td></tr>";
                    }
                    Literal2.Text += "</table>";
                }
                con.Close();
            }
        }
    }
}
