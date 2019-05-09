<%@ Page Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="Products.aspx.cs" Inherits="Lab07.Products" Title="Untitled Page" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MasterContentPlaceHolder1" runat="server">
<center>
        <h1>
            Τα προιοντα μας:
        </h1>
    </center>
    <br />
    <table>
        <tr style="width: 100%; vertical-align:top">
            <td style="width: 300px">
                <asp:Literal ID="Literal1" runat="server">
                </asp:Literal>
            </td>
            <td style="width: 760px">
                <asp:Literal ID="Literal2" runat="server">
                </asp:Literal>
            </td>
        </tr>
    </table>
</asp:Content>
