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
            else
            {

                string conString = "Provider=Microsoft.ACE.OLEDB.12.0; Data Source="
                    + Server.MapPath("~/ebookstoredb.mdb");
                using (OleDbConnection con = new OleDbConnection(conString))
                {
                    con.Open();
                    string query = "SELECT count(*) FROM customer "
                        + "WHERE uname=@username AND passwd=@passowrd";
                    using (OleDbCommand cmd = new OleDbCommand(query, con))
                    {
                        cmd.Parameters.AddWithValue("@username", usernameTB.Text);
                        cmd.Parameters.AddWithValue("@passowrd", passwordTB.Text);

                        int result = (int)cmd.ExecuteScalar();
                        if (result == 1)
                        {
                            string query2 = "SELECT ID FROM customer "
                                + "WHERE uname=@username AND passwd=@passowrd";
                            using (OleDbCommand cmd2 = new OleDbCommand(query2, con))
                            {
                                cmd2.Parameters.AddWithValue("@username", usernameTB.Text);
                                cmd2.Parameters.AddWithValue("@passowrd", passwordTB.Text);

                                OleDbDataReader rdr = cmd2.ExecuteReader();
                                rdr.Read();
                                int id = rdr.GetInt32(0);

                                Session["user_id"] = id;
                            }
                            Session["user"] = usernameTB.Text;
                            Response.Redirect("Default.aspx");
                        }
                        else
                        {
                            errorL.Text = "Δοκιμάστε ξανά";
                        }
                    }
                    con.Close();
                }
            }
        }

            protected void PasswordRem(object sender, EventArgs e)
            {
                Response.Redirect("Default.aspx");
            }
            protected void Register(object sender, EventArgs e)
            {
                Response.Redirect("Register.aspx");
            }
    }
}
