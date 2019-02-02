<%@ Page Language="C#" MasterPageFile="~/MasterPage.Master" AutoEventWireup="true" Inherits="Lab07.Register" CodeBehind="Register.aspx.cs"
   Title="Untitled Page" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" runat="server">
</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="MasterContentPlaceHolder1" runat="server">
    <asp:MultiView ID="MultiView1" runat="server">
        <asp:View ID="RegisterV" runat="server">
            <center>
                <asp:Table ID="Table1" runat="server">
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Όνομα:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:TextBox ID="OnomaTB" runat="server"></asp:TextBox><br />
                            <asp:RequiredFieldValidator ID="RequiredFieldValidator1" runat="server" ErrorMessage="Αυτο το πεδίο είναι υποχρεωτικό"
                                ControlToValidate="OnomaTB"></asp:RequiredFieldValidator>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Επώνυμο:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:TextBox ID="EponymoTB" runat="server"></asp:TextBox><br />
                            <asp:RequiredFieldValidator ID="RequiredFieldValidator2" runat="server" ErrorMessage="Αυτο το πεδίο είναι υποχρεωτικό"
                                ControlToValidate="EponymoTB"></asp:RequiredFieldValidator>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Email:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:TextBox ID="EmailTB" runat="server"></asp:TextBox><br />
                            <asp:RequiredFieldValidator ID="RequiredFieldValidator3" runat="server" ErrorMessage="Αυτο το πεδίο είναι υποχρεωτικό"
                                ControlToValidate="EmailTB"></asp:RequiredFieldValidator><br />
                            <asp:RegularExpressionValidator ID="RegularExpressionValidator1" runat="server" ErrorMessage="Το mail δεν ειναι έγκυρο"
                                ControlToValidate="EmailTB" ValidationExpression="\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*"></asp:RegularExpressionValidator>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Username:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:TextBox ID="UsernameTB" runat="server"></asp:TextBox><br />
                            <asp:RequiredFieldValidator ID="RequiredFieldValidator4" runat="server" ErrorMessage="Αυτο το πεδίο είναι υποχρεωτικό"
                                ControlToValidate="UsernameTB"></asp:RequiredFieldValidator>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Password:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:TextBox ID="Password1TB" runat="server" TextMode="Password"></asp:TextBox><br />
                            <asp:RequiredFieldValidator ID="RequiredFieldValidator5" runat="server" ErrorMessage="Αυτο το πεδίο είναι υποχρεωτικό"
                                ControlToValidate="Password1TB"></asp:RequiredFieldValidator>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Επιβεβαίωση Password:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:TextBox ID="Password2TB" runat="server" TextMode="Password"></asp:TextBox><br />
                            <asp:RequiredFieldValidator ID="RequiredFieldValidator6" runat="server" ErrorMessage="Αυτο το πεδίο είναι υποχρεωτικό"
                                ControlToValidate="Password2TB"></asp:RequiredFieldValidator><br />
                            <asp:CompareValidator ID="CompareValidator1" runat="server" ErrorMessage="ο κωδικός δεν είναι ίδιος"
                                ControlToCompare="Password1TB" ControlToValidate="Password2TB"></asp:CompareValidator>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Διεύθυνση:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:TextBox ID="DieuthinsiTB" runat="server"></asp:TextBox><br />
                            <asp:RequiredFieldValidator ID="RequiredFieldValidator7" runat="server" ErrorMessage="Αυτο το πεδίο είναι υποχρεωτικό"
                                ControlToValidate="DieuthinsiTB"></asp:RequiredFieldValidator>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Τηλέφωνο:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:TextBox ID="ThlefonoTB" runat="server"></asp:TextBox><br />
                            <asp:RequiredFieldValidator ID="RequiredFieldValidator8" runat="server" ErrorMessage="Αυτο το πεδίο είναι υποχρεωτικό"
                                ControlToValidate="ThlefonoTB"></asp:RequiredFieldValidator>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    ΤΚ:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:TextBox ID="TKTB" runat="server"></asp:TextBox><br />
                            <asp:RequiredFieldValidator ID="RequiredFieldValidator9" runat="server" ErrorMessage="Αυτο το πεδίο είναι υποχρεωτικό"
                                ControlToValidate="TKTB"></asp:RequiredFieldValidator>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Πόλη:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:TextBox ID="PolhTB" runat="server"></asp:TextBox><br />
                            <asp:RequiredFieldValidator ID="RequiredFieldValidator10" runat="server" ErrorMessage="Αυτο το πεδίο είναι υποχρεωτικό"
                                ControlToValidate="PolhTB"></asp:RequiredFieldValidator>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Χώρα:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:DropDownList ID="ChoraDDL" runat="server">
                                <asp:ListItem></asp:ListItem>
                                <asp:ListItem>Ελλάδα</asp:ListItem>
                                <asp:ListItem>Κύπρος</asp:ListItem>
                            </asp:DropDownList>
                            <br />
                            <asp:RequiredFieldValidator ID="RequiredFieldValidator11" runat="server" ErrorMessage="Αυτο το πεδίο είναι υποχρεωτικό"
                                ControlToValidate="ChoraDDL"></asp:RequiredFieldValidator>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Φύλλο:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:RadioButtonList ID="FulloRBL" runat="server">
                                <asp:ListItem>Άνδρας</asp:ListItem>
                                <asp:ListItem>Γυναίκα</asp:ListItem>
                            </asp:RadioButtonList>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Αποδοχή Όρων:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:CheckBox ID="ApodoxiOronCB" runat="server" />
                        </asp:TableCell>
                    </asp:TableRow>
                </asp:Table>
                <asp:Button ID="Button1" runat="server" Text="Εγγραφή" 
                    onclick="Button1_Click" />
            </center>
        </asp:View>
        <asp:View ID="ConfirmV" runat="server">
            <center>
                <asp:Table ID="Table2" runat="server">
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Όνομα:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:Label ID="OnomaL" runat="server" Text=""></asp:Label>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Επώνυμο:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:Label ID="EponymoL" runat="server" Text=""></asp:Label>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Email:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:Label ID="EmailL" runat="server" Text=""></asp:Label>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Διεύθυνση:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:Label ID="DieuthinsiL" runat="server" Text=""></asp:Label>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Τηλέφωνο:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:Label ID="ThlefonoL" runat="server" Text=""></asp:Label>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    ΤΚ:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:Label ID="TKL" runat="server" Text=""></asp:Label>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Πόλη:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:Label ID="PoliL" runat="server" Text=""></asp:Label>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Χώρα:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:Label ID="ChoraL" runat="server" Text=""></asp:Label>
                        </asp:TableCell>
                    </asp:TableRow>
                    <asp:TableRow VerticalAlign="Top">
                        <asp:TableCell>
                    Φύλλο:
                        </asp:TableCell>
                        <asp:TableCell>
                            <asp:Label ID="FulloL" runat="server" Text=""></asp:Label>
                        </asp:TableCell>
                    </asp:TableRow>
                </asp:Table>
                <asp:Button ID="Button2" runat="server" Text="Αποδοχή" 
                    onclick="Button2_Click" />
            </center>
        </asp:View>
    </asp:MultiView>
</asp:Content>
