<%@ Page Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" CodeBehind="ProductInfo.aspx.cs" Inherits="Lab08.ProductInfo" Title="Untitled Page" %>
<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="MasterContentPlaceHolder1" runat="server">
    <asp:Label ID="Label1" runat="server" Text="Name: "></asp:Label>
    <asp:Label ID="BookNameL" runat="server" Text="Label"></asp:Label><br />
    <asp:Label ID="Label2" runat="server" Text="Description: "></asp:Label>
    <asp:Label ID="BookDescriptionL" runat="server" Text="Label"></asp:Label><br />
    <asp:Label ID="Label3" runat="server" Text="Price: "></asp:Label>
    <asp:Label ID="BookPriceL" runat="server" Text="Label"></asp:Label><br />
    <asp:Label ID="Label4" runat="server" Text="Quantity: "></asp:Label>
    <asp:TextBox ID="BookQuantityL" value="1" runat="server"></asp:TextBox><br />
    <asp:Button ID="Button1" runat="server" Text="Add to cart" OnClick="B1Click"/>
</asp:Content>
