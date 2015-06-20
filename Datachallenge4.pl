#!/usr/bin/perl

use strict;
use warnings;


my $n = 0;
my $m = 0;
my $output;
my @array;
my %kwhash;
open(IN, "merge_output_invite_quote.csv") or die("file open error");
open(OUT, ">moiq.csv");
while(<IN>){
   chomp;
   if($n!= 0){
     @array = split;
     if(exists $kwhash{$array[1]}){
        $output = $_;
        $output =~ s/\r//g;
        print OUT "$output\t$m\n";
     }else{
        $m++;
        $kwhash{$array[1]}=1;
        $output = $_;
        $output =~ s/\r//g;
        print OUT "$output\t$m\n";
     }
   }else{
     $output = $_;
     $output =~ s/\r//g;
     print OUT "$output\ttime_id\n";
   }

   $n++;

}

close OUT;
close IN;

