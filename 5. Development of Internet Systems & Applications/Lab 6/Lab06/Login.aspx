<%@ Page Language="C#" MasterPageFile="~/MasterPage.master" AutoEventWireup="true" CodeBehind="Login.aspx.cs" Inherits="Lab06.Login" Title="Untitled Page" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MasterContentPlaceHolder1" runat="server">
    <asp:Label ID="errorL" runat="server" Text=" "></asp:Label>
<table>
    <tr>
        <td> Ονομα χρηστη: </td>
        <td><asp:TextBox ID="usernameTB" runat="server"></asp:TextBox></td>
    </tr>
    <tr>
        <td> Κωδικος: </td>
        <td><asp:TextBox ID="passwordTB" runat="server" TextMode="Password"></asp:TextBox></td>
    </tr>
    <tr>
        <td> &nbsp; </td>
        <td><asp:Button ID="loginSubmit" runat="server" Text="Εισοδος" OnClick="LoginSubmit" /></td>
    </tr>
</table>
</asp:Content>
