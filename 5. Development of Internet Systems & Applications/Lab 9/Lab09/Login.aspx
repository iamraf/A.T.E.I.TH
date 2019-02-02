<%@ Page Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="Login.aspx.cs" Inherits="Lab07.Login" Title="Untitled Page" %>
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
    <asp:LinkButton ID="passRemB" runat="server" OnClick="PasswordRem">Υπενθυμιση κωδικου</asp:LinkButton><br />
    <asp:LinkButton ID="registerB" runat="server" OnClick="Register">Εγγραφη</asp:LinkButton><br />
</asp:Content>
